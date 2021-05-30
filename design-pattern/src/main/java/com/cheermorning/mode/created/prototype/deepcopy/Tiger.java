package com.cheermorning.mode.created.prototype.deepcopy;

import lombok.NoArgsConstructor;

import java.io.*;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-21
 */
@NoArgsConstructor
public class Tiger implements Serializable, Cloneable{

    private static final long serialVersionUID = 1L;

    public String info;
    public Sheep sheep;



    /**
     * 1. 第一种方式：克隆，进行深拷贝
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Tiger tiger = (Tiger) obj;
        tiger.sheep = (Sheep) tiger.sheep.clone();
        return tiger;
    }

    /**
     * 第二种方式：利用对象的序列化通过流处理，进行深拷贝(推荐使用)
     * */
    public Object deepClone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //对象序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //将当前对象以流的方式进行输出
            oos.writeObject(this);

            //对象反序列化
            //将输出流存进输入流
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            //进行流对象读取，并转化成当前对象
            Tiger tiger = (Tiger) ois.readObject();
            return tiger;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try{
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e2){
                System.out.println(e2.getLocalizedMessage());
            }
        }
    }

}
