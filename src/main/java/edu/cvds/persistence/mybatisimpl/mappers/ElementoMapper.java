package edu.cvds.persistence.mybatisimpl.mappers;

import org.apache.ibatis.annotations.Param;

public interface ElementoMapper {

	public void registrarElemento(@Param("id") int id, @Param("tipo")String tipo,@Param("marca") String marca);

}
