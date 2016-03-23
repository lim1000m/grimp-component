package c.e.g.domain;

import java.util.ArrayList;
import java.util.Map;

/**
 * @File Name : Grivo.java
 * @Project Name : grimp
 * @package Name : c.e.g.domain
 * @create Date : 2016. 2. 24.
 * @explain : 페이징 정보와 도메인 객체 정보를 담는 객체
 * @made by : "GOEDOKID"
 */
public class Grivo {

	//페이징 정보
	Map<String, Object> pager;
	
	//그리드 정보
	ArrayList<?> gridList;
	
	//Grider 형태
	Class<?> gridCls;
	
	/**
	 * 그리보 생성자
	 * @param pager
	 * @param gridList
	 */
	public Grivo(Class<?> cls, Map<String, Object> pager, ArrayList<?> gridList) {
		this.pager = pager;
		this.gridList = gridList;
		this.gridCls = cls;
	}
	
	/**
	 * 그리보 생성자
	 * @param pager
	 * @param gridList
	 */
	public Grivo(Map<String, Object> pager, ArrayList<?> gridList) {
		this.pager = pager;
		this.gridList = gridList;
	}

	public Map<String, Object> getPager() {
		return pager;
	}

	public void setPager(Map<String, Object> pager) {
		this.pager = pager;
	}

	public ArrayList<?> getGridList() {
		return gridList;
	}

	public void setGridList(ArrayList<?> gridList) {
		this.gridList = gridList;
	}

	public Class<?> getGridCls() {
		return gridCls;
	}

	public void setGridCls(Class<?> gridCls) {
		this.gridCls = gridCls;
	}
	
}
