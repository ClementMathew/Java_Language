
// Thread Synchronization Implementation

class Thread_Sync {
    public synchronized void display(int n, int t) {
        for (int i = n; i <= t; i++) {
            System.out.println(i * 5);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Multi_1 extends Thread {
    Thread_Sync obj;

    Multi_1(Thread_Sync obj) {
        this.obj = obj;
    }

    public void run() {
        obj.display(1, 5);
    }
}

class Multi_2 extends Thread {
    Thread_Sync obj;

    Multi_2(Thread_Sync obj) {
        this.obj = obj;
    }

    public void run() {
        obj.display(6, 10);
    }
}

class Multi_Thread_Synchronization {
    public static void main(String args[]) {
        Thread_Sync obj = new Thread_Sync();
        Multi_1 obj1 = new Multi_1(obj);
        Multi_2 obj2 = new Multi_2(obj);
        obj1.start();
        obj2.start();
    }
}