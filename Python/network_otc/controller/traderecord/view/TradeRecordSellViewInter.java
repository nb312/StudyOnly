package coin.otc.com.network.controller.traderecord.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.traderecord.item.TradeRecordSellItem;
import coin.otc.com.network.controller.traderecord.param.TradeRecordSellParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 售出
 */

public interface TradeRecordSellViewInter extends BaseViewInter {
     
TradeRecordSellParam getTradeRecordSellParam();
void onTradeRecordSellSuccess(TradeRecordSellItem item);

}
