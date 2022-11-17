package com.dmitry.NewsClient.mapstruct;

import com.dmitry.NewsClient.dto.PublicUserView;
import com.dmitry.NewsClient.dto.PutUserDtoResponse;
import com.dmitry.NewsClient.entity.UserEntity;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-17T12:03:34+0300",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class UserViewMapperImpl implements UserViewMapper {

    @Override
    public PublicUserView userView(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PublicUserView publicUserView = new PublicUserView();

        publicUserView.setAvatar( entity.getAvatar() );
        publicUserView.setEmail( entity.getEmail() );
        if ( entity.getId() != null ) {
            publicUserView.setId( UUID.fromString( entity.getId() ) );
        }
        publicUserView.setName( entity.getName() );
        publicUserView.setRole( entity.getRole() );

        return publicUserView;
    }

    @Override
    public PutUserDtoResponse userDtoResp(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PutUserDtoResponse putUserDtoResponse = new PutUserDtoResponse();

        putUserDtoResponse.setAvatar( entity.getAvatar() );
        putUserDtoResponse.setEmail( entity.getEmail() );
        if ( entity.getId() != null ) {
            putUserDtoResponse.setId( UUID.fromString( entity.getId() ) );
        }
        putUserDtoResponse.setName( entity.getName() );
        putUserDtoResponse.setRole( entity.getRole() );

        return putUserDtoResponse;
    }
}
