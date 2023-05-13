import java.io.*;
import java.util.StringTokenizer;

class Node {
    int val;
    Node next;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
class Queue {
    Node head;
    Node last;

    int size = 0;

    public Queue() {}

    public Queue(Node head) {
        this.head = head;
        this.last = head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int value) {
        size += 1;
        if(isEmpty()){
            head = new Node(value, null);
            last = head;
            return;
        }

        Node cur = last;
        last = new Node(value, null);
        cur.next = last;
    }

    public int pop() {
        if(isEmpty()){
            return -1;
        }

        size--;
        Node cur = head;

        if(cur.next == null) {
            head = null;
            return cur.val;
        }

        head = head.next;
        return cur.val;
    }

    public int getSize() {
        return size;
    }

    public int front() {
        if(isEmpty()){
            return  -1;
        }

        return head.val;
    }

    public int back() {
        if(isEmpty()){
            return -1;
        }

        return last.val;
    }
}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer srt;
        int N = Integer.parseInt(reader.readLine());
        Queue queue = new Queue();

        while(N-- > 0) {
            srt = new StringTokenizer(reader.readLine());
            String op = srt.nextToken();
            switch (op) {
                case "push" -> {
                    int num = Integer.parseInt(srt.nextToken());
                    queue.push(num);
                }
                case "pop" -> {
                    int result = queue.pop();
                    writer.write(result +"\n");
                }
                case "size" -> {
                    int result = queue.getSize();
                    writer.write(result +"\n");
                }
                case "empty" -> {
                    boolean result = queue.isEmpty();
                    writer.write((result ? 1: 0) +"\n");
                }
                case "front" -> {
                    int result = queue.front();
                    writer.write(result +"\n");
                }
                case "back" -> {
                    int result = queue.back();
                    writer.write(result +"\n");
                }
            }
        }

        writer.flush();
        writer.close();
    }
}
