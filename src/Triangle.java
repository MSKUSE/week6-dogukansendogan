public class Triangle {
    public class Triangle extends Shape {
        private int sideA, sideB, sideC;

        public Triangle(Point location, int sideA, int sideB, int sideC) {
            super(location);
            setSides(sideA, sideB, sideC);
        }

        public int getSideA() {
            return sideA;
        }

        public int getSideB() {
            return sideB;
        }

        public int getSideC() {
            return sideC;
        }

        public void setSides(int sideA, int sideB, int sideC) {
            if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
                throw new IllegalArgumentException("KENARLAR POZİTİF OLACAK!!!");
            }
            if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
                throw new IllegalArgumentException("GEÇERSİZ !!!");
            }
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        @Override
        public int perimeter() {
            return sideA + sideB + sideC;
        }

        @Override
        public int area() {
            double s = perimeter() / 2.0;
            return (int) Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        }

        @Override
        public String toString() {
            return "Triangle{" +
                    "location=" + getLocation() +
                    ", sideA=" + sideA +
                    ", sideB=" + sideB +
                    ", sideC=" + sideC +
                    ", perimeter=" + perimeter() +
                    ", area=" + area() +
                    '}';
        }
    }
}
