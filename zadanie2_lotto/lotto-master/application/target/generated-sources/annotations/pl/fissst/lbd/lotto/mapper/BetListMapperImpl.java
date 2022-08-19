package pl.fissst.lbd.lotto.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.fissst.lbd.lotto.dto.BetDto;
import pl.fissst.lbd.lotto.dto.FindResultDto;
import pl.fissst.lbd.lotto.model.BetListModelApi;
import pl.fissst.lbd.lotto.model.BetModelApi;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-27T17:43:30+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16 (Oracle Corporation)"
)
@Component
public class BetListMapperImpl implements BetListMapper {

    @Autowired
    private BetMapper betMapper;

    @Override
    public BetListModelApi mapDtoToModelApi(FindResultDto<BetDto> findResultDto) {
        if ( findResultDto == null ) {
            return null;
        }

        BetListModelApi betListModelApi = new BetListModelApi();

        betListModelApi.setStartElement( findResultDto.getStartElement() );
        betListModelApi.setTotalCount( findResultDto.getTotalCount() );
        betListModelApi.setCount( findResultDto.getCount() );
        betListModelApi.setResults( betDtoListToBetModelApiList( findResultDto.getResults() ) );

        return betListModelApi;
    }

    protected List<BetModelApi> betDtoListToBetModelApiList(List<BetDto> list) {
        if ( list == null ) {
            return null;
        }

        List<BetModelApi> list1 = new ArrayList<BetModelApi>( list.size() );
        for ( BetDto betDto : list ) {
            list1.add( betMapper.mapDtoToModelApi( betDto ) );
        }

        return list1;
    }
}
