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

class Deque {
    Node head;
    Node last;
    Node prev;
    int size = 0;

    public Deque() {}

    public Deque(Node head) {
        this.head = head;
        this.last = head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push_front(int value) {
        size += 1;
        if(isEmpty()){
            head = new Node(value, null);
            last = head;
            return;
        }

        Node cur = head;
        head = new Node(value, cur);
    }

    public void push_back(int value) {
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

    public int pop_front() {
        if(isEmpty()){
            return -1;
        }

        size--;
        Node cur = head;

        if(cur.next == null) {
            head = null;
            last = null;
            return cur.val;
        }

        head = cur.next;
        return cur.val;
    }

    public int pop_back() {
        if(isEmpty()){
            return -1;
        }


        size--;
        Node cur = head;
        Node prev = cur;

        if(cur.next == null) {
            head = null;
            last = null;
            return cur.val;
        }

        while(cur.next != null) {
            prev = cur;
            cur = cur.next;
        }

        last = prev;
        last.next = null;
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
        Deque deque = new Deque();
        
        while(N-- > 0) {
            srt = new StringTokenizer(reader.readLine());
            String op = srt.nextToken();
            try {

            switch (op) {
                case "push_front" -> {
                    int num = Integer.parseInt(srt.nextToken());
                    deque.push_front(num);
                }
                case "push_back" -> {
                    int num = Integer.parseInt(srt.nextToken());
                    deque.push_back(num);
                }
                case "pop_front" -> {
                    int result = deque.pop_front();
                    writer.write(result +"\n");
                }
                case "pop_back" -> {
                    int result = deque.pop_back();
                    writer.write(result +"\n");
                }
                case "size" -> {
                    int result = deque.getSize();
                    writer.write(result +"\n");
                }
                case "empty" -> {
                    boolean result = deque.isEmpty();
                    writer.write((result ? 1: 0) +"\n");
                }
                case "front" -> {
                    int result = deque.front();
                    writer.write(result +"\n");
                }
                case "back" -> {
                    int result = deque.back();
                    writer.write(result +"\n");
                }
            }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        writer.flush();
        writer.close();
    }
}
