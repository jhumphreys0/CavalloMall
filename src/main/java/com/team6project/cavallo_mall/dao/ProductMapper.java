package com.team6project.cavallo_mall.dao;

import com.team6project.cavallo_mall.pojo.Product;
import com.team6project.cavallo_mall.vo.ProductSalesStatisticVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectByCategoryIdSet(@Param("categoryIdSet") Set<Integer> categoryIdSet);

    List<Product> selectByProductIdSet(@Param("productIdSet") Set<Integer> productIdSet);

    ProductSalesStatisticVo findProductSalesQuantity(Integer categoryId);

    List<ProductSalesStatisticVo> findProductSalesQuantityList();


}