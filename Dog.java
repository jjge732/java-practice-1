class Dog {
    public static final int NUMBER_OF_LEGS = 4;
    final private String name;
    private Boolean isFed;
    private Boolean hasUsedBathroom;

    public Dog(String name, boolean isFed, boolean hasUsedBathroom) {
        this.name = name;
        this.isFed = isFed;
        this.hasUsedBathroom = hasUsedBathroom;
    }

    public Dog(String name) {
        this(name, false, false);
    }

    public void feed() {
        this.isFed = true;
    }

    public void letOutside() {
        this.hasUsedBathroom = true;
    }
}