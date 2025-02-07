public class Elevator {

    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor -= 1;
    }

    public void moveUp() {
        currentFloor += 1;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor ) {
            System.out.println("Неверный этаж");
        } else if (floor > currentFloor) {
            for (int i = currentFloor; i <= floor; i++) {
                System.out.println("Текущий этаж: " + i);
                currentFloor = i;
            }
        } else if (floor < currentFloor) {
            for (int i = currentFloor; i >= floor; i--) {
                System.out.println("Текущий этаж: " + i);
                currentFloor = i;
            }
        }
    }
}
