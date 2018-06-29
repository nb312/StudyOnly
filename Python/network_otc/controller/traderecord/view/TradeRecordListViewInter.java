package coin.otc.com.network.controller.traderecord.view;

import com.nb.libcommon.network.mvp.inter.BaseViewInter;
import java.util.List;

import coin.otc.com.network.controller.traderecord.item.TradeRecordListItem;
import coin.otc.com.network.controller.traderecord.param.TradeRecordListParam;


/**
 * Created by NieBin on 2018/1/10.
 * GitHub: https://github.com/nb312
 * 相关接口: 交易列表
 */

public interface TradeRecordListViewInter extends BaseViewInter {
     
TradeRecordListParam getTradeRecordListParam();
void onTradeRecordListSuccess(TradeRecordListItem item);

}
