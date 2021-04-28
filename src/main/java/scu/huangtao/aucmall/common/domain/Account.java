package scu.huangtao.aucmall.common.domain;

public class Account {
    private Integer id;

    private String etheraddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEtheraddress() {
        return etheraddress;
    }

    public void setEtheraddress(String etheraddress) {
        this.etheraddress = etheraddress == null ? null : etheraddress.trim();
    }
}