cmake_minimum_required(VERSION 3.4.1)

find_package(OpenMP)

add_library(processimg SHARED
    src/main/cpp/processimg.cpp
    src/main/cpp/processimg_neon.cpp)

find_library(log-lib log)

target_link_libraries(processimg
    PRIVATE
    ${log-lib}
    OpenMP::OpenMP_CXX)
