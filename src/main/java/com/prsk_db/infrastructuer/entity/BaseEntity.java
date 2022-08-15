package com.prsk_db.infrastructuer.entity;

/*
 *  エンティティのベースクラス
 *  継承不要
 *  エンティティ作成時のコピペ用
 *  シーケンス不要なら@Id下の2行を削除して使用してください
 * 
 *  @author name
 */
// @Entity
// @Table(name = "テーブル名")
public class BaseEntity {
	
	/**
	 * 〇〇ID
	 */
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_〇〇_gen")
//	@SequenceGenerator(name = "seq_〇〇_gen", sequenceName = "seq_〇〇", allocationSize = 1)
	private Integer id;

}
