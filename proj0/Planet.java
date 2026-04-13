public class Planet {

    public static final double G = 6.67e-11;

    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;

    public Planet(double xP, double yP, double xV,
            double yV, double m, String img) {
                this.xxPos = xP;
                this.yyPos = yP;
                this.xxVel = xV;
                this.yyVel = yV;
                this.mass = m;
                this.imgFileName = img;
    }

    public Planet(Planet p){
        this.xxPos = p.xxPos;
        this.yyPos = p.yyPos;
        this.xxVel = p.xxVel;
        this.yyVel = p.yyVel;
        this.mass = p.mass;
        this.imgFileName = p.imgFileName;
    }

    public double calcDistance(Planet p) {
        double dx = this.xxPos - p.xxPos;
        double dy = this.yyPos - p.yyPos;
        double distance = Math.pow((dx * dx + dy * dy),0.5);
        return distance;
    }

    public double calcForceExertedBy(Planet p) {
        double distance = this.calcDistance(p);
        return G * this.mass * p.mass / (distance * distance);
    }

    public double calcForceExertedByX (Planet p) {
        double f = this.calcForceExertedBy(p);
        double distance = this.calcDistance(p);
        return f * (p.xxPos - this.xxPos) / distance;
    }

    public double calcForceExertedByY (Planet p) {
        double f = this.calcForceExertedBy(p);
        double distance = this.calcDistance(p);
        return f * (p.yyPos - this.yyPos) / distance;
    }

    public double calcNetForceExertedByX(Planet[] all) {
        double f = 0;
        for(int i = 0; i < all.length; i++) {
            if(this.equals(all[i])){
                continue;
            }
            f += this.calcForceExertedByX(all[i]);
        }
        return f;
    }

    public double calcNetForceExertedByY(Planet[] all) {
        double f = 0;
        for(int i = 0; i < all.length; i++) {
            if(this.equals(all[i])){
                continue;
            }
            f += this.calcForceExertedByY(all[i]);
        }
        return f;
    }

    public void update(double dt, double nx, double ny) {
        double ax = nx / this.mass;
        double ay = ny / this.mass;
        this.xxVel += ax * dt;
        this.yyVel += ay * dt;
        this.xxPos += this.xxVel * dt;
        this.yyPos += this.yyVel * dt;
    }
}