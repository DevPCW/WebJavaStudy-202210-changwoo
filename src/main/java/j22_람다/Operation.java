package j22_람다;

@FunctionalInterface // 이거 달아줘야 함. 약속(추상메소드 하나 더 만드는 거 방지)
public interface Operation {

    public int calc(int x, int y);

    public default String resultToString(int result) {
        return "결과: " + result;
    }
}
