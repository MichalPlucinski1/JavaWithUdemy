public record StudentRecord(String name, int semester) {
    @Override
    public String toString() {
        return "StudentRecord{" +
                "name='" + name + '\'' +
                ", semester=" + semester +
                '}';
    }
}
