package com.lotto.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lotto.bean.LottoBean;
import com.lotto.service.LottoService;

public class LottoServiceImpl implements LottoService {
	List<LottoBean> lottos;
	int cusNum;
	public LottoServiceImpl() {
		lottos=new ArrayList<LottoBean>();
		cusNum=1;
	}
	@Override
	public List<LottoBean> buyLotto(int num) {
		for(int j=0;j<num/1000;j++) {
			LottoBean bean =new LottoBean();
			bean.setMoney(1000);
			bean.setLottoNum("1 2 3 4 5 6 \n");
			lottos.add(bean);
		}
		return lottos;
	}

	@Override
	public List<LottoBean> createLottoNum(String bool) {
		if(bool.equalsIgnoreCase("y")) {
			String foo;
			int[] ar=new int[6];
			for(int i=0;i<lottos.size();i++) {
				foo="";
				ar[0]=(int)(Math.random()*44+1);
				for(int j=1;j<6;j++) {
					ar[j]=(int)(Math.random()*44+1);
					for(int k=0;k<j;k++) {
						if(ar[j]==ar[k]) {
							j--;
							break;
						}
					}
				}
				for(int bar=0;bar<ar.length;bar++) {
					Arrays.sort(ar);
					foo=foo.concat(String.valueOf(ar[bar]+" "));
				}
				lottos.get(i).setLottoNum(foo);
			}
		}
		return lottos;
	}
}
