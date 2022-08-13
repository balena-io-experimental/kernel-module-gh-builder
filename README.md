Kernel module balenaOS block builder example
============================================

This repository provides a Github Actions workflow to build a balenaOS block
containing a Linux kernel module.

Customizing this project
========================

The projects defaults to using the `balena-os/balena-raspberrypi` device
repository and customizes it's kernel to build a new kernel module.

The project includes a `meta-balena-block` layer. This can be used to customize
the build output.

By default it contains a `balena-block` image recipe with a list of kernel
modules to build.

