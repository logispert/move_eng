package taxiguider.external;

import org.springframework.stereotype.Component;

@Component
public class TaximanageServiceFallback implements TaximanageService {
	 
	//@Override
	//public void 택시할당요청(택시관리 택시관리) 
	//{	
	//	System.out.println("Circuit breaker has been opened. Fallback returned instead.");
	//}
	
	
	@Override
	public void requestTaxiAssign(Taximanage txMange) {
		// TODO Auto-generated method stub
		System.out.println("Circuit breaker has been opened. Fallback returned instead. " 
				+ txMange.getId());
	}

}
