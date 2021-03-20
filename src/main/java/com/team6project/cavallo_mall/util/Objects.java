package com.team6project.cavallo_mall.util;

import com.team6project.cavallo_mall.anno.ReflectField;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/20 14:10
 */
@Slf4j
public class Objects {

	private Objects() {}
	
	/**
	 * Fill the target object with the data field of the source
	 * Conversion will only be done when the field name + type of the target object is consistent with the field name + type of the source object
	 * If the field corresponding to the target is inconsistent with the field name of the source object, it can be marked with @ReflectField("sourceField")
	 * Recursively process embedded objects (object arrays)
	 * @param source source object
	 * @param target target object
	 */
	public static void fillTargetObject(Object source, Object target) {
		if (target != null && source != null) {
			Field[] fields = Refs.getAllFields(target.getClass());
			for (int i = 0; i < fields.length; i ++) {
				Field targetField = fields[i];
				
				ReflectField reflectField = targetField.getAnnotation(ReflectField.class);
				String name = reflectField  != null ? Strings.nvl(reflectField.value(), targetField.getName()): targetField.getName();
				boolean isPojo = reflectField  != null ? reflectField.isPojo() : false;
				Field sourceField = Refs.getFieldByFieldName(source, name);
				log.debug("filling {},{} ",name,isPojo);
				if (sourceField == null) {
					log.warn("source Object[{}.class] has no Filed {}", source.getClass().getSimpleName(), name);
				} else if (sourceField != null && sourceField.getType() == targetField.getType()) {
					Object sourceValue = Refs.getFieldValue(source, sourceField);
					if (sourceValue != null) {
						Refs.setFieldValue(target, targetField, sourceValue);
					}
					
				} else if (sourceField != null && sourceField.getType().isArray() && targetField.getType().isArray()) {
					Object sourceValue = Refs.getFieldValue(source, sourceField);
					if (sourceValue != null) {
						int tLen = Array.getLength(sourceValue);
						if (tLen > 0) {
							try {
								Object newTargetFieldArray = Array.newInstance(targetField.getType().getComponentType(), tLen);
								for (int j = 0; j < tLen; j++) {
									Object objectTarget = targetField.getType().getComponentType().newInstance();
									Array.set(newTargetFieldArray, j, objectTarget);
									Object objectSource = Array.get(sourceValue, j);
									fillTargetObject(objectSource, objectTarget);
								}
								Refs.setFieldValue(target, targetField, newTargetFieldArray);
							} catch (InstantiationException | IllegalAccessException e) {
								log.error(e.getMessage(), e);
							}
							
						}
					}
				} else if (sourceField != null && isPojo) {
					try {
						Object sourceFieldValue = Refs.getFieldValue(source, sourceField);
						if (sourceFieldValue != null) {
							Object targetFieldValue = targetField.getType().newInstance();
							fillTargetObject(sourceFieldValue, targetFieldValue);
							Refs.setFieldValue(target, targetField, targetFieldValue);
						}
					} catch (InstantiationException | IllegalAccessException e) {
						log.error(e.getMessage(), e);
					}
				}
			}
		}
	}
}
