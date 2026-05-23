package entities;

import enums.TableStatus;

public class RestaurantTable {
        private Integer number;
        private Integer capacity;
        private TableStatus status;

        public RestaurantTable(Integer number, Integer capacity, TableStatus status) {
            this.number = number;
            this.capacity = capacity;
            this.status = TableStatus.FREE;
        }

        public Integer getNumber() {
            return number;
        }

        public Integer getCapacity() {
            return capacity;
        }

        public TableStatus getStatus() {
            return status;
        }

        public void occupy(){
            status = TableStatus.BUSY;

        }

        public void release(){
            status = TableStatus.FREE;
        }

        public void reserved(){
            status = TableStatus.RESERVED;
        }

        public void disable(){
            status = TableStatus.INACTIVE;
        }
}


