package practical_software.refactorin.katas.AlgoTrader;

import java.util.List;

public interface IStocksRepoistory {

	List<Stock> getAllStocks();

	void delete(Stock stock) throws Exception;
}
