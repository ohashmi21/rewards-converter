public class RewardValue {
    private double _cash=0;
    private float _miles=0;

    public RewardValue(float miles){
        _miles=miles;
        _cash=(0.0035/miles);
    }

    public RewardValue(double cash){
        _cash=cash;
        _miles=(float) (_cash*0.0035);
    }

    public double getCashValue(){
        return _cash;
    }
    public float getMilesValue(){
        return _miles;
    }
}
