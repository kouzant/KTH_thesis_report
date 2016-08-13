@PersistenceCapable(table = TABLE_NAME)
public interface GarbageCollectorDTO {

    @PrimaryKey
    @Column(name = RPC_ID)
    int getrpcid();
    void setrpcid(int rpcid);
    
    @Column(name = TYPE)
    String gettype();
    void settype(String type);
}
