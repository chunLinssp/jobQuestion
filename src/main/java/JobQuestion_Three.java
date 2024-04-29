import java.util.HashMap;
import java.util.Map;

public class JobQuestion_Three {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int item1_apple = calculate1(1, 5);
        int item2_strawberry = calculate1(2, 5);
        int sum = item1_apple + item2_strawberry;

        int item3_apple = calculate2(new Strawberry(8), 1);
        int item4_strawberry = calculate2(new Apple(13), 1);
        int item5_mango = calculate2(new Mango(20), 1);
        int sum2 = item3_apple + item4_strawberry + item5_mango;

        Map<String ,Integer> map = new HashMap<String, Integer>();
        map.put("Apple",8);
        map.put("Strawberry",13);
        map.put("Mango",20);
        int item_apple = calculate3(map, "Apple", 1);
        int item_strawberry = calculate3(map, "Strawberry", 1);
        int item_mango = calculate3(map, "Mango", 1);
        int sum3 = item_apple + item_strawberry + item_mango;

        System.out.println("方法１　得出客户购买商品总价" + sum);
        System.out.println("方法２　得出客户购买商品总价" + sum2);
        System.out.println("方法３　得出客户购买商品总价" + sum3);

        int item7_apple = calculate2(new Strawberry(8), 1);
        int item8_strawberry = calculate2(new Apple(13), 1);
        int item9_mango = calculate2(new Mango(20), 1);
        // 草莓参与8折活动
        double item8_strawberry_new_place = joinActivity(2, item2_strawberry);
        double sum4 = item7_apple + item9_mango + item8_strawberry_new_place;

        System.out.println("方法２ 草莓参与8折活动，　得出客户购买商品总价" + sum3);


    }

    public static double joinActivity(int type,int place) {
        if(type == 2) {
            return place * 1.0 * 0.8;
        }
        return place * 1.0;
    }



    /**
     * 超市增加了一种水果芒果，其定价为 20 元/斤。
     * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     *  @param type  1苹果  2草莓  3芒果
     *  @param count
     *  @return
     */
    public static int calculate1(int type,int count) {
        if(type == 1) {
            return 8 * count;
        }
        if(type == 2) {
            return 13 * count;
        }
        if(type == 3) {
            return 20 * count;
        }
        return 0;
    }


    public static int calculate2(Fruit fruit,int count) {
        int place = fruit.getPlace();
        return place * count;
    }

    /**
     * @param map  苹果：8  草莓13   芒果20
     * @param fruit
     * @param count
     * @return
     */
    public static int calculate3(Map<String,Integer> map, String fruit, int count) {
        Integer place = map.get(fruit);
        return place * count;
    }

    static abstract class Fruit {
        int place;
        public Fruit(int place) {
            this.place = place;
        }
        public int getPlace() {
            return place;
        }
    }

    static class Apple extends Fruit{
        public Apple(int place) {
            super(place);
        }
    }

    static class Strawberry extends Fruit{
        public Strawberry(int place) {
            super(place);
        }
    }

    static class Mango extends Fruit{
        public Mango(int place) {
            super(place);
        }
    }

}
