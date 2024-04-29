

public class JobQuestion_One {

    public static void main(String[] args) {

    }

    /**
     * 有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
     * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
     * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     * @return
     */
    public int calculate1(int type,int count) {
        if(type == 1) {
            return 8 * count;
        }
        if(type == 2) {
            return 13 * count;
        }
        return 0;
    }

    public int calculate2(Fruit fruit,int count) {
        int place = fruit.getPlace();
        return place * count;
    }

    class Fruit {
        int place;
        public Fruit(int place) {
            this.place = place;
        }
        public int getPlace() {
            return place;
        }
    }

    class Apple extends Fruit{
        public Apple(int place) {
            super(place);
        }
    }

    class Strawberry extends Fruit{
        public Strawberry(int place) {
            super(place);
        }
    }



}
