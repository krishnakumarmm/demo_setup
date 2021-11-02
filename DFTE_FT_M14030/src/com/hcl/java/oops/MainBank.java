package com.hcl.java.oops;

public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HdfcErgo hdfcobj = new HdfcErgo();
		hdfcobj.hdfcInfo();
		hdfcobj.hdfcErgoInfo();
		hdfcobj.rbiInfo();
		
		Stock stockObj = new Stock();
		stockObj.iciciInfo();
		stockObj.stockInfo();
		stockObj.rbiInfo();

		RBI rbiObj = new HdfcErgo();
		rbiObj.roi();
	}

}
