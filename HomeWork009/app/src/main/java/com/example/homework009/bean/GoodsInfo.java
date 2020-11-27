package com.example.homework009.bean;

import com.example.homework009.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "RIO锐澳鸡尾酒", "百威啤酒", "纯牛奶", "好欢螺螺蛳粉", "哈根达斯", "黑巧克力", "良品铺子零食", "玫瑰花茶"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "RIO锐澳鸡尾酒预调酒套装女生酒微醺小美好330ml*10罐洋酒",
            "【双11加购】百威啤酒ME3果啤真的很迷270ml*10听罐装新品首发",
            "新西兰原装进口纽仕兰4.0g蛋白学生早餐全脂纯牛奶250ml*24盒整箱",
            "好欢螺螺蛳粉300gx6袋柳州特产美食螺狮粉速食螺丝粉方便面酸辣粉",
            "哈根达斯冰淇淋小纸杯5个脆皮条5个单次兑换券代金券冰激凌雪糕",
            "松露形黑巧克力网红零食品糖果散装大礼包礼物礼盒装（代可可脂）",
            "良品铺子零食大礼包女超大一箱零食女生良品铺子巨型包组合装整箱",
            "玫瑰花茶大朵特级重瓣干玫瑰平阴玫瑰茶大花冠泡水玫瑰花冠茶花茶"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {56, 99, 72, 69, 199, 120,22,106};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.a01_s, R.drawable.a02_s, R.drawable.a03_s,
            R.drawable.a04_s, R.drawable.a05_s, R.drawable.a06_s,
            R.drawable.a07_s, R.drawable.a08_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.a01, R.drawable.a02, R.drawable.a03,
            R.drawable.a04, R.drawable.a05, R.drawable.a06,
            R.drawable.a07, R.drawable.a08
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}