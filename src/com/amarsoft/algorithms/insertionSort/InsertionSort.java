/*
 * File Name: InsertionAort.java
 * Copyright: Copyright 2015-2016 Amarsoft FAS All Rights Reserved.
 * Description: 
 * Author: amarsoft
 * Create Date: 2016年10月9日
 * Modifier: amarsoft
 * Modify Date: 2016年10月9日
 * Bugzilla Id: 
 * Modify Content: 
 */
package com.amarsoft.algorithms.insertionSort;

import javax.lang.model.element.VariableElement;

/**
 * 〈algorithms example for INSERTION-SORT〉
 * @author    gyli
 * @version   FAS V0.0.1, 2016年10月9日
 * @see       
 * @since     FAS V0.0.1
 */

public class InsertionSort {

	/**
	 * 〈INSERTION-SORT function〉
	 * @param sortArray 待排序数组
	 * @return 排序完成之后的数组
	 */
	public static int[]  insertSort(int[] sortArray) {
		int length = sortArray.length; //数组长度
		int i = 0;        			   //当前值位置
		int j = 0;					   //指向j前的位置
		int key = 0;				   //当前要进行插入排序的值
		//从数组第二个位置开始遍历值
		for( j = 1; j < length; j++){
			key = sortArray[j];
			i = j - 1;
			//sortArray[i]值比当前值大，sortArray[i]后移一位，空出i的位置，好让下一次循环的值后移
			while(i >=0 && sortArray[i] > key){
				sortArray[i+1] = sortArray[i];//将i值后移
				i--; //i前移
			}//跳出循环(找到要插入的中间位置或已遍历到0下标)  
			sortArray[i+1] = key;////将当前值插入
		}
		return sortArray;
	}
	
	public static void main(String[] args) {
		int[] sortArray = { 1, 78, 12, 39, 78, 23, 19 ,25, 89, 103, 1, 8, 7, 12 };
		int[] testArray =  insertSort(sortArray);
		for(int i : testArray){
			System.out.println(i);
		}
	}
	
}
