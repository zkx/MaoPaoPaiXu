/*
* 冒泡排序
* 依次和后面进行比较，如果比后面一个数大则交换
*
* */
package com.zk;

public class PaiXu {

    public static void main(String []args){

        //冒泡排序
        //假定第一个数最小
        int count = 20;
        double arr[] = new double[count];


        for(int k = 0;k<arr.length;k++){
            //随机生成
            //Math.random() 随机生成一个0～1的数
            double t = (Math.random()*1000);
            //将数据添加到数组
            arr[k] = t;
        }

        Dubbo dubbo = new Dubbo();
        dubbo.sort(arr);


        for(int i = 0;i<arr.length;i++) {
            System.out.println("查看顺序" + arr[i]);
        }
    }
}

//冒泡排序
class Dubbo{

    double temp = 0;
    public void sort(double arr[]){
        for(int i = 0;i<arr.length-1;i++){
            //内层比较一直在减少 -i
            for(int j = 0;j<arr.length-1-i;j++){

                //内层循环，开始逐个比较，如果发现前一个数比后一个数大则交换

                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

}