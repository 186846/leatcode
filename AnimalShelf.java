package leetcode;

import java.util.LinkedList;

class AnimalShelf {

    LinkedList<int[]> Cat;
    LinkedList<int[]> Dog;

    public AnimalShelf() {
        Cat = new LinkedList<>();
        Dog = new LinkedList<>();
    }

    public void enqueue(int[] animal) {
        // 判断种类后入队
        if (animal[1] == 0) {
            Cat.addLast(animal);
        } else if (animal[1] == 1) {
            Dog.addLast(animal);
        }
    }

    // 挑选所有动物中最老的
    public int[] dequeueAny() {
        // 取出cat的队首，判空则直接返回
        int[] headCat;
        if (!Cat.isEmpty()) {
            headCat = Cat.getFirst();
        } else if (!Dog.isEmpty()) {
            // 当猫队列无猫时，直接将狗队列的第一个出队
            return queueDog.removeFirst();
        } else {
            // 代表猫狗队列中无任何猫狗
            return new int[]{-1,-1};
        }
        // 取出dog的队首，判空则直接返回
        int[] headDog;
        if (!Dog.isEmpty()) {
            headDog = Dog.getFirst();
        } else {
            // 当狗队列无狗时，直接将猫队列的第一个出队
            return Cat.removeFirst();
        }
        // 当同时都有猫狗时 比较后返回 判断猫狗中谁比较老
        if (headCat[0]<=headDog[0]) {
            return Cat.removeFirst();
        } else {
            return Dog.removeFirst();
        }
    }
    // 挑选狗
    public int[] dequeueDog() {
        if (!Dog.isEmpty()) {
            return Dog.removeFirst();
        } else {
            return new int[]{-1,-1};
        }
    }
    // 挑选猫
    public int[] dequeueCat() {
        if (!Cat.isEmpty()) {
            return Cat.removeFirst();
        } else {
            return new int[]{-1,-1};
        }
    }
}
