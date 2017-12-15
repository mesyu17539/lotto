package com.lotto.service;

import java.util.List;

import com.lotto.bean.LottoBean;

public interface LottoService {
	public List<LottoBean> buyLotto(int num);
	public List<LottoBean> createLottoNum(String showInputDialog);
}
