public class Patron_Builder {
        public static void main(String[] args) {
            Pizza pizza = new Pizza.Builder()
                    .masa("Fina")
                    .salsa("Tomate")
                    .relleno("Queso y jamón")
                    .build();
            System.out.println("Pizza creada con masa " + pizza.getMasa() +
                    ", salsa " + pizza.getSalsa() +
                    " y relleno " + pizza.getRelleno());
        }
    }
class Pizza {
    private String masa;
    private String salsa;
    private String relleno;
    public static class Builder {
        private String masa;
        private String salsa;
        private String relleno;
        public Builder masa(String masa) {
            this.masa = masa;
            return this;
        }
        public Builder salsa(String salsa) {
            this.salsa = salsa;
            return this;
        }
        public Builder relleno(String relleno) {
            this.relleno = relleno;
            return this;
        }
        public Pizza build() {
            Pizza p = new Pizza();
            p.masa = this.masa;
            p.salsa = this.salsa;
            p.relleno = this.relleno;
            return p;
        }
    }
    public String getMasa() {
        return masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public String getRelleno() {
        return relleno;
    }

}

