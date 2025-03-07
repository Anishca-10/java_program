class breakstatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 13) {
                System.out.println("Stopping at 13");
                break;
            }
            System.out.println(i);
        }
    }
}