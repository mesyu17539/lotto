package com.lotto.bean;

public class LottoBean {
	private int money;
	private String lottoNum;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getLottoNum() {
		return lottoNum;
	}
	public void setLottoNum(String lottoNum) {
		this.lottoNum = lottoNum;
	}
	@Override
	public String toString() {
		return "[구매금액=" + money + " 로또번호" + lottoNum + "]\n";
	}
}
