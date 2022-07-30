package leetcode;

import java.util.LinkedList;

class AnimalShelf {

    LinkedList<int[]> queueCat;
    LinkedList<int[]> queueDog;

    public AnimalShelf() {
        queueCat = new LinkedList<>();
        queueDog = new LinkedList<>();
    }

    public void enqueue(int[] animal) {
        // �ж���������
        if (animal[1] == 0) {
            queueCat.addLast(animal);
        } else if (animal[1] == 1) {
            queueDog.addLast(animal);
        }
    }

    // ��ѡ���ж��������ϵ�
    public int[] dequeueAny() {
        // ȡ��cat�Ķ��ף��п���ֱ�ӷ���
        int[] headCat;
        if (!queueCat.isEmpty()) {
            headCat = queueCat.getFirst();
        } else if (!queueDog.isEmpty()) {
            // ��è������èʱ��ֱ�ӽ������еĵ�һ������
            return queueDog.removeFirst();
        } else {
            // ����è�����������κ�è��
            return new int[]{-1,-1};
        }
        // ȡ��dog�Ķ��ף��п���ֱ�ӷ���
        int[] headDog;
        if (!queueDog.isEmpty()) {
            headDog = queueDog.getFirst();
        } else {
            // ���������޹�ʱ��ֱ�ӽ�è���еĵ�һ������
            return queueCat.removeFirst();
        }
        // ��ͬʱ����è��ʱ �ȽϺ󷵻� �ж�è����˭�Ƚ���
        if (headCat[0]<=headDog[0]) {
            return queueCat.removeFirst();
        } else {
            return queueDog.removeFirst();
        }
    }
    // ��ѡ��
    public int[] dequeueDog() {
        if (!queueDog.isEmpty()) {
            return queueDog.removeFirst();
        } else {
            return new int[]{-1,-1};
        }
    }
    // ��ѡè
    public int[] dequeueCat() {
        if (!queueCat.isEmpty()) {
            return queueCat.removeFirst();
        } else {
            return new int[]{-1,-1};
        }
    }
}
