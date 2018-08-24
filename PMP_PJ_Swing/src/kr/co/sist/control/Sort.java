/*
 * ���� : ����
 * ���� : 2018 08 24
 * �� : ������ ������ �ϱ����� Ŭ����
 * ����ȯ�� : ������8.1 , ��Ŭ��������, JDK1.8.0_192
 */
package kr.co.sist.control;

import java.util.Vector;

import kr.co.sist.model.Pmp;

public class Sort {
	private Vector<Pmp> vector;
	
	public Sort(Vector<Pmp> vector) {
		this.vector = vector;
	}

	public void BubbleSort() {
		for(int i = 0 ; i < this.vector.size() -1 ; i ++) {
			for(int j = 0 ; j < this.vector.size() -i -1 ; j++) {
				if(this.vector.get(j).getPrice() < this.vector.get(j+1).getPrice()) {
					swap(j,j+1);
				}
			}
		}
		
	}
	private void swap(int a , int b) {
		Pmp tmp = this.vector.get(a);
		this.vector.setElementAt(this.vector.elementAt(b), a);
		this.vector.setElementAt(tmp, b);
	}

}
