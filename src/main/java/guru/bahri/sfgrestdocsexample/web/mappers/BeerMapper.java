package guru.bahri.sfgrestdocsexample.web.mappers;

import guru.bahri.sfgrestdocsexample.domain.Beer;
import guru.bahri.sfgrestdocsexample.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
