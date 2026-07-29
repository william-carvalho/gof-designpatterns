package com.designpatterns.creational.builder;

/**
 * Product built step by step by {@link Builder}.
 */
public final class Computer {

    private final String processor;
    private final String memory;
    private final String storage;
    private final boolean dedicatedGraphics;

    private Computer(Builder builder) {
        this.processor = builder.processor;
        this.memory = builder.memory;
        this.storage = builder.storage;
        this.dedicatedGraphics = builder.dedicatedGraphics;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", storage='" + storage + '\'' +
                ", dedicatedGraphics=" + dedicatedGraphics +
                '}';
    }

    public static class Builder {

        private final String processor;
        private final String memory;
        private String storage = "256 GB SSD";
        private boolean dedicatedGraphics;

        public Builder(String processor, String memory) {
            this.processor = processor;
            this.memory = memory;
        }

        public Builder withStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder withDedicatedGraphics() {
            this.dedicatedGraphics = true;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
