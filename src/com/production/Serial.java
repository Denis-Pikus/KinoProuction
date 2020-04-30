package com.production;

public class Serial extends Movie {
    private int seriesCount;        //кол-во серий
    private final double seriesCost = 0.5;      //затратына однусерию

    public Serial() { }

    public Serial(String movieTitle, String producer, Enum genre, int seriesCount) {
        super(movieTitle, producer, genre);
        this.seriesCount = seriesCount;
    }

    public int getSeriesCount() {
        return seriesCount;
    }
    //метод который возвращает  true, если у него больше трех серий
    public boolean series(){
        return this.getSeriesCount() > 3 ? true : false;
    }

    @Override
    public double movieCosts() {
        return seriesCost * this.getSeriesCount();
    }

}
