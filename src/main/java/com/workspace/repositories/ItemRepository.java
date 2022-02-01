package com.workspace.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.workspace.Entity.Items;

/**
 * Itemsに紐づく処理のリポジトリ
 * @author ari77
 *
 */
@Repository
public interface ItemRepository extends JpaRepository <Items, Long> {

	@Query("select * from Items where field = value order by id asc")
	public List<Items> searchByfieldvalue(@Param("field") String field, @Param("value") String value);

}
