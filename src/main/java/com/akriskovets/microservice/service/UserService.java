package com.akriskovets.microservice.service;

import com.akriskovets.grpc.UserServiceGRPCGrpc;
import com.akriskovets.grpc.UserServiceGRPCOuterClass;
import com.akriskovets.microservice.DTO.UserDTO;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @GrpcClient("userservice")
    UserServiceGRPCGrpc.UserServiceGRPCBlockingStub stub;
    public UserDTO getUser(Long userId) {
        UserServiceGRPCOuterClass.UserRequest request = UserServiceGRPCOuterClass.UserRequest.newBuilder().setId(userId).build();
        UserServiceGRPCOuterClass.UserResponse response = stub.getUser(request);
        UserDTO userDTO = new UserDTO();
        userDTO.setId(request.getId());
        userDTO.setName(response.getName());
        userDTO.setPhone(response.getPhone());
        return userDTO;
    }
}
