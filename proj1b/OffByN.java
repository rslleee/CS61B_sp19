public class OffByN implements CharacterComparator{
    private int n;
    public OffByN(int N){
        n = N;
    }

    @Override
    public boolean equalChars(char x, char y){
        int d = Math.abs(x - y);
        return d == n;
    }
}
