package com.lotto.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

import com.lotto.constants_pool.Value;
import com.lotto.service.LottoService;
import com.lotto.serviceimpl.LottoServiceImpl;

public class LottoController {
	public static void main(String[] args) {
		LottoService service=new LottoServiceImpl();
		String message="";
//		BufferedReader
		while(true) {
			switch(JOptionPane.showInputDialog(Value.MENU)) {
			case "0": return;
			case "1":
				JOptionPane.showMessageDialog(null, service.buyLotto(Integer.parseInt(JOptionPane.showInputDialog(Value.STR[0]))));
				break;
			case "2":
				message= service.createLottoNum(JOptionPane.showInputDialog(Value.STR[1])).toString();
				JOptionPane.showMessageDialog(null,message);
				break;
			case "3":
				File f= new File("C:\\Users\\1027\\jse\\eclipse\\workspace\\lotto\\lotto.txt");
				BufferedWriter bw=null;
				try {
					bw=new BufferedWriter(new FileWriter(f));
					bw.write(message);
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						bw.flush();
						bw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				break;
			case "4":
				
				break;
			}
		}
	}
}
