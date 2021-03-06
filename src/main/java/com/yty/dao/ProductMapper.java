package com.yty.dao;

import com.yty.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;


@Mapper
public interface ProductMapper {

    /**
     * 通过商品编号获得商品信息
     * @param id
     * @return
     */
    Product getProduct(String id);

    /**
     * 通过种类id获取该种类的商品
     * @param id
     * @return
     */
    List<Product> getProductList(String id);

    /**
     * 检查该浏览记录是否存在
     * @param email
     * @param goodsId
     * @return
     */
    String checkLookup(@Param("email") String email,@Param("goodsId") String goodsId);

    /**
     * 更新浏览记录
     *
     * @param date
     * @param email
     * @param goodsId
     * @return
     */
    boolean updateLookup(@Param("email") String email,@Param("goodsId") String goodsId,@Param("date") String date);

    /**
     * 插入浏览记录
     * @param email
     * @param goodsId
     * @param date
     * @return
     */
    boolean insertLookup(@Param("email") String email,@Param("goodsId") String goodsId,@Param("date") String date);

    /**
     * 获取改用户的浏览记录
     * @param email
     * @return
     */
    List<Product> getAllLookup(String email);

    /**
     * 添加商品
     * @param product
     * @return
     */
    boolean addGoods(Product product);

    /**
     * 查询商品
     * @param title
     * @param categoryId
     * @param start
     * @param end
     * @return
     */
    List<Product> getSearchList(@Param("title") String title,@Param("categoryId") String categoryId,
                                @Param("start") Integer start,@Param("end") Integer end);

    /**
     * 删除商品
     * @param id
     * @return
     */
    boolean deleteGood(String id);

    /**
     * 更改商品信息
     * @param product
     * @return
     */
    boolean updateGood(Product product);

    /**
     * 查找商品
     * @param title
     * @param start
     * @param end
     * @return
     */
    List<Product> getSearchHome(@Param("title") String title,@Param("start") Integer start,@Param("end") Integer end);

    /**
     *
     * @return
     */
    List<Product> query();
}
