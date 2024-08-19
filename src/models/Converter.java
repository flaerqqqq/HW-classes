package models;

public class Converter {

    private double usd;

    private double eur;

    private double rub;

    public Converter(double usd, double eur, double rub) {
        this.usd = usd;
        this.eur = eur;
        this.rub = rub;
    }

    public double convert(Currency from, Currency to, double amount) {
        if (from == to) {
            return amount;
        }

        switch (from) {
            case UAH:
                switch (to) {
                    case USD:
                        return amount / usd;
                    case EUR:
                        return amount / eur;
                    case RUB:
                        return amount / rub;
                }
                break;
            case USD:
                switch (to) {
                    case UAH:
                        return amount * usd;
                    case EUR:
                        return amount * (usd / eur);
                    case RUB:
                        return amount * (usd / rub);
                }
                break;
            case EUR:
                switch (to) {
                    case RUB:
                        return amount * (eur / rub);
                    case USD:
                        return amount * (eur / usd);
                    case UAH:
                        return amount * eur;
                }
                break;
            case RUB:
                switch (to) {
                    case EUR:
                        return amount * (rub / eur);
                    case USD:
                        return amount * (rub / usd);
                    case UAH:
                        return amount * rub;
                }
                break;
        }

        throw new RuntimeException("Conversion exception");
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getEur() {
        return eur;
    }

    public void setEur(double eur) {
        this.eur = eur;
    }

    public double getRub() {
        return rub;
    }

    public void setRub(double rub) {
        this.rub = rub;
    }

    public enum Currency {
        UAH, USD, EUR, RUB
    }
}
