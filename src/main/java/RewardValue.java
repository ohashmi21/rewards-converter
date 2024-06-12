public class RewardValue {
    private double _cash=0;
    private float _miles=0;

    public RewardValue(float miles){
        this._miles=miles;
        this._cash=(0.0035/miles);
    }

    public RewardValue(double cash){
        this._cash=cash;
        this._miles=(float) (_cash*0.0035);
    }

    public double getCashValue(){
        return this._cash;
    }
    public float getMilesValue(){
        return this._miles;
    }
}
