
package coin.otc.com.network.controller.advertise.param;

/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关对应的接口：我的广告列表：包含全部、进行中、已关闭，用参数type区分
 */
public class ListMyAdParam {

  
/**
* 当前页起始行
*/
private long offset;


/**
* 每页显示的记录条数
*/
private long limit;


/**
* 列表类型：不传表示全部，1进行中，2已关闭
*/
private int type;


/**
* 币种id
*/
private long coinId;


/**
* 广告类型：0买，1卖
*/
private int entrustType;


public void setOffset(long offset){
this.offset = offset;
}

public long getOffset(){
 return this.offset;
}

public void setLimit(long limit){
this.limit = limit;
}

public long getLimit(){
 return this.limit;
}

public void setType(int type){
this.type = type;
}

public int getType(){
 return this.type;
}

public void setCoinId(long coinId){
this.coinId = coinId;
}

public long getCoinId(){
 return this.coinId;
}

public void setEntrustType(int entrustType){
this.entrustType = entrustType;
}

public int getEntrustType(){
 return this.entrustType;
}


}

