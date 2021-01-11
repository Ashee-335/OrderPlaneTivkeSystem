public class Order {
    private float id;
    private float customerType;//乘机人类型
    private float airPorTax;//机场税
    private float ryf;//燃油费
    private float hkzhx;//航空综合险
    private float jptgx;//机票退改险
    private float yhq;//优惠券
    private float hszj;//含税总价
    private Customer customer[];

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public float getCustomerType() {
        return customerType;
    }

    public void setCustomerType(float customerType) {
        this.customerType = customerType;
    }

    public float getAirPorTax() {
        return airPorTax;
    }

    public void setAirPorTax(float airPorTax) {
        this.airPorTax = airPorTax;
    }

    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getHkzhx() {
        return hkzhx;
    }

    public void setHkzhx(float hkzhx) {
        this.hkzhx = hkzhx;
    }

    public float getJptgx() {
        return jptgx;
    }

    public void setJptgx(float jptgx) {
        this.jptgx = jptgx;
    }

    public float getYhq() {
        return yhq;
    }

    public void setYhq(float yhq) {
        this.yhq = yhq;
    }

    public float getHszj() {
        return hszj;
    }

    public void setHszj(float hszj) {
        this.hszj = hszj;
    }

    public Customer[] getCustomer() {
        return customer;
    }

    public void setCustomer(Customer[] customer) {
        this.customer = customer;
    }
}
