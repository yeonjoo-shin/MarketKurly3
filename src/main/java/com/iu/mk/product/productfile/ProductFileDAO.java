package com.iu.mk.product.productfile;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductFileDAO {
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE ="com.iu.mk.product.productfile.ProductFileDAO.";
	
	public List<ProductFileVO> fileList(Long p_num) throws Exception{
		return sqlSession.selectList(NAMESPACE+"fileList",p_num);
	}
	
	public int fileInsert(ProductFileVO productFileVO) throws Exception{
		
		System.out.println(productFileVO.getOriName()); // 이미지 사진이 filedao까지 들어오는지 확인
		
		return sqlSession.insert(NAMESPACE+"fileInsert",productFileVO);
	}
	
	
	
	
}
